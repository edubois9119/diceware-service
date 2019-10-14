package edu.cnm.deepdive.dicewareservice.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Word {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name= "word_id", nullable = false, updatable = false)
  private long id;

  @Column(nullable = false, updatable = false)
  private String word;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name= "passphrase_id", nullable = false, updatable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Passphrase passphrase;

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Passphrase getPassphrase() {
    return passphrase;
  }

  public long getId() {
    return id;
  }

  public void setPassphrase(Passphrase passphrase) {
    this.passphrase = passphrase;


  }
}
