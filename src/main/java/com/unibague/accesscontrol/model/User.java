package com.unibague.accesscontrol.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users") // Mongo usa colecciones en lugar de tablas
public class User {
    @Id
    private String id;

    @Indexed(unique = true) // Hace que el campo sea único en MongoDB
    private String username;

    private String password;
}
