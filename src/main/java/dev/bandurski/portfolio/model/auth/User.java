package dev.bandurski.portfolio.model.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "users", 
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username")
        })
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "username", "password", "roles"})
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 50)
  private String username;

  @NotBlank
  @Size(max = 120)
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

}
