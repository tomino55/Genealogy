package com.tomasoft.genealogy.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity{

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "granted_at")
    private Date grantedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    public UserRole(int id, String roleName, User user, Date grantedAt){
        super(id);
        this.setRoleName(roleName);
        this.setUser(user);
        this.setGrantedAt(grantedAt);
    }

    public UserRole(){
        super();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getGrantedAt() {
        return grantedAt;
    }

    public void setGrantedAt(Date grantedAt) {
        this.grantedAt = grantedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
