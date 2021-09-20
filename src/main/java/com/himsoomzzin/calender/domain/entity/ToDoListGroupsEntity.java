package com.himsoomzzin.calender.domain.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Group_TodoList")
@Data
@RequiredArgsConstructor
public class ToDoListGroupsEntity {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "todolist_id")
    private ToDoListEntity toDoList;

    @ManyToOne
    @JoinColumn(name = "groups_id")
    private GroupsEntity groups;
}
