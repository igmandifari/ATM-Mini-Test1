package com.igman.technicaltest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="m_user_credential")
public class UserCredential {
    @Id
    @GenericGenerator(name="uuid",strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @ManyToOne
    @JoinColumn(name="role_id")
    private Role roleId;
}
