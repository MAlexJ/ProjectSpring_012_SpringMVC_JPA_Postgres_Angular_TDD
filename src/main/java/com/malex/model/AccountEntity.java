package com.malex.model;

import com.malex.model.templ.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Entity
@Table(name = "account")
@NamedEntityGraphs({
        @NamedEntityGraph(name = AccountEntity.ROLES_GRAPH, attributeNodes = {@NamedAttributeNode("roles")})
})
public class AccountEntity extends BaseEntity {

    public static final String ROLES_GRAPH = "AccountEntity.roles";

    @Column(name = "user_name", unique = true)
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RoleEntity> roles = new ArrayList<>();

}
