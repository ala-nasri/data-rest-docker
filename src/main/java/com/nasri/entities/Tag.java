package com.nasri.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(
        name="tag",
        uniqueConstraints=
        @UniqueConstraint(name = "unique_constraint_tag_type", columnNames={"type", "label"})
)
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String type;

    private String label;
}
