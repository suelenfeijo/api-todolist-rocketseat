package com.suelen.springbootform.task;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String description;

  @Column(length = 50)
  private String title;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;

  @Getter
  @Setter
  private UUID idUser;

  @CreationTimestamp
  private LocalDateTime createdAt;	

  public void setTitle(String title) throws Exception {
	    if (title.length() > 50) {
	      throw new Exception("O campo title deve conter no máximo 50 caracteres");
	    }

	    this.title = title;
	  }

}

