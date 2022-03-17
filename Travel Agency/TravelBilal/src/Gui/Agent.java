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
@Table(name = "AGENT", catalog = "", schema = "JUHM")
@NamedQueries({
    @NamedQuery(name = "Agent.findAll", query = "SELECT a FROM Agent a")
    , @NamedQuery(name = "Agent.findByAgentId", query = "SELECT a FROM Agent a WHERE a.agentId = :agentId")
    , @NamedQuery(name = "Agent.findByCityCode", query = "SELECT a FROM Agent a WHERE a.cityCode = :cityCode")
    , @NamedQuery(name = "Agent.findByAgentName", query = "SELECT a FROM Agent a WHERE a.agentName = :agentName")
    , @NamedQuery(name = "Agent.findByAgentUser", query = "SELECT a FROM Agent a WHERE a.agentUser = :agentUser")
    , @NamedQuery(name = "Agent.findByAgentPass", query = "SELECT a FROM Agent a WHERE a.agentPass = :agentPass")
    , @NamedQuery(name = "Agent.findByAgentPhone", query = "SELECT a FROM Agent a WHERE a.agentPhone = :agentPhone")})
public class Agent implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "AGENT_ID")
    private BigDecimal agentId;
    @Column(name = "CITY_CODE")
    private String cityCode;
    @Column(name = "AGENT_NAME")
    private String agentName;
    @Column(name = "AGENT_USER")
    private String agentUser;
    @Column(name = "AGENT_PASS")
    private String agentPass;
    @Column(name = "AGENT_PHONE")
    private String agentPhone;

    public Agent() {
    }

    public Agent(BigDecimal agentId) {
        this.agentId = agentId;
    }

    public BigDecimal getAgentId() {
        return agentId;
    }

    public void setAgentId(BigDecimal agentId) {
        BigDecimal oldAgentId = this.agentId;
        this.agentId = agentId;
        changeSupport.firePropertyChange("agentId", oldAgentId, agentId);
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        String oldCityCode = this.cityCode;
        this.cityCode = cityCode;
        changeSupport.firePropertyChange("cityCode", oldCityCode, cityCode);
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        String oldAgentName = this.agentName;
        this.agentName = agentName;
        changeSupport.firePropertyChange("agentName", oldAgentName, agentName);
    }

    public String getAgentUser() {
        return agentUser;
    }

    public void setAgentUser(String agentUser) {
        String oldAgentUser = this.agentUser;
        this.agentUser = agentUser;
        changeSupport.firePropertyChange("agentUser", oldAgentUser, agentUser);
    }

    public String getAgentPass() {
        return agentPass;
    }

    public void setAgentPass(String agentPass) {
        String oldAgentPass = this.agentPass;
        this.agentPass = agentPass;
        changeSupport.firePropertyChange("agentPass", oldAgentPass, agentPass);
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        String oldAgentPhone = this.agentPhone;
        this.agentPhone = agentPhone;
        changeSupport.firePropertyChange("agentPhone", oldAgentPhone, agentPhone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agentId != null ? agentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.agentId == null && other.agentId != null) || (this.agentId != null && !this.agentId.equals(other.agentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gui.Agent[ agentId=" + agentId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
