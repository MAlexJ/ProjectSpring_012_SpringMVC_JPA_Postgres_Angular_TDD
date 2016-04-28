package com.malex.model;

import com.malex.model.enums.Role;
import com.malex.model.templ.BaseEntity;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(exclude = "account")
@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountEntity account;
}
