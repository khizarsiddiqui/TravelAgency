/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
/**
 *
 * @author 
 */
@Entity
@Table(name = "ADMIN", catalog = "", schema = "JUHM")
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findByAdminId", query = "SELECT a FROM Admin a WHERE a.adminId = :adminId")
    , @NamedQuery(name = "Admin.findByAdminName", query = "SELECT a FROM Admin a WHERE a.adminName = :adminName")
    , @NamedQuery(name = "Admin.findByAdminUser", query = "SELECT a FROM Admin a WHERE a.adminUser = :adminUser")
    , @NamedQuery(name = "Admin.findByAdminPass", query = "SELECT a FROM Admin a WHERE a.adminPass = :adminPass")})
public class Admin implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ADMIN_ID")
    private BigDecimal adminId;
    @Column(name = "ADMIN_NAME")
    private String adminName;
    @Column(name = "ADMIN_USER")
    private String adminUser;
    @Column(name = "ADMIN_PASS")
    private String adminPass;

    public Admin() {
    }

    public Admin(BigDecimal adminId) {
        this.adminId = adminId;
    }

    public BigDecimal getAdminId() {
        return adminId;
    }

    public void setAdminId(BigDecimal adminId) {
        BigDecimal oldAdminId = this.adminId;
        this.adminId = adminId;
        changeSupport.firePropertyChange("adminId", oldAdminId, adminId);
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        String oldAdminName = this.adminName;
        this.adminName = adminName;
        changeSupport.firePropertyChange("adminName", oldAdminName, adminName);
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        String oldAdminUser = this.adminUser;
        this.adminUser = adminUser;
        changeSupport.firePropertyChange("adminUser", oldAdminUser, adminUser);
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        String oldAdminPass = this.adminPass;
        this.adminPass = adminPass;
        changeSupport.firePropertyChange("adminPass", oldAdminPass, adminPass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminId != null ? adminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.adminId == null && other.adminId != null) || (this.adminId != null && !this.adminId.equals(other.adminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gui.Admin[ adminId=" + adminId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
