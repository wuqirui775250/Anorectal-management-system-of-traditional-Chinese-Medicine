package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Diseaseinformation {

  private long tid;
  private String operation;
  private String indications;
  private String anaesthesia;
  private String step;
  private String duration;
  private String note;
  private String degree;
  private String reprocess;
  private String recovery;
  private String influence;
  private String advantage;
  private String defect;
  private String imageurl;


  @Override
  public String toString() {
    return "Diseaseinformation{" +
            "tid=" + tid +
            ", operation='" + operation + '\'' +
            ", indications='" + indications + '\'' +
            ", anaesthesia='" + anaesthesia + '\'' +
            ", step='" + step + '\'' +
            ", duration='" + duration + '\'' +
            ", note='" + note + '\'' +
            ", degree='" + degree + '\'' +
            ", _Reprocess='" + reprocess + '\'' +
            ", recovery='" + recovery + '\'' +
            ", influence='" + influence + '\'' +
            ", advantage='" + advantage + '\'' +
            ", defect='" + defect + '\'' +
            ", imageurl='" + imageurl + '\'' +
            '}';
  }

  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public String getIndications() {
    return indications;
  }

  public void setIndications(String indications) {
    this.indications = indications;
  }

  public String getAnaesthesia() {
    return anaesthesia;
  }

  public void setAnaesthesia(String anaesthesia) {
    this.anaesthesia = anaesthesia;
  }

  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getReprocess() {
    return reprocess;
  }

  public void setReprocess(String reprocess) {
    this.reprocess = reprocess;
  }

  public String getRecovery() {
    return recovery;
  }

  public void setRecovery(String recovery) {
    this.recovery = recovery;
  }

  public String getInfluence() {
    return influence;
  }

  public void setInfluence(String influence) {
    this.influence = influence;
  }

  public String getAdvantage() {
    return advantage;
  }

  public void setAdvantage(String advantage) {
    this.advantage = advantage;
  }

  public String getDefect() {
    return defect;
  }

  public void setDefect(String defect) {
    this.defect = defect;
  }

  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }
}
