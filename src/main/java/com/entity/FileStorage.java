package com.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "filestore")
@Data
@Getter
@Setter
@NoArgsConstructor
public class FileStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String filePath;

    private String filename;

}
