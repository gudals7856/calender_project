package com.himsoomzzin.calender.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "to_do_list")
@Getter
@Setter
@RequiredArgsConstructor
public class ToDoListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String author;  // userId

    private String startDate;

    private String endDate;

    private String content;

    @OneToMany(mappedBy = "toDoList")
    private List<ToDoListGroupsEntity> toDoListGroupsEntities = new ArrayList<>();
}