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
import java.math.BigInteger;
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
 * @author Hamza
 */
@Entity
@Table(name = "CUSTOMER", catalog = "", schema = "JUHM")
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustId", query = "SELECT c FROM Customer c WHERE c.custId = :custId")
    , @NamedQuery(name = "Customer.findByAgentId", query = "SELECT c FROM Customer c WHERE c.agentId = :agentId")
    , @NamedQuery(name = "Customer.findByCityCode", query = "SELECT c FROM Customer c WHERE c.cityCode = :cityCode")
    , @NamedQuery(name = "Customer.findByCustName", query = "SELECT c FROM Customer c WHERE c.custName = :custName")
    , @NamedQuery(name = "Customer.findByCustUser", query = "SELECT c FROM Customer c WHERE c.custUser = :custUser")    
    , @NamedQuery(name = "Customer.findByCustPass", query = "SELECT c FROM Customer c WHERE c.custPass = :custPass")
    , @NamedQuery(name = "Customer.findByCustPhone", query = "SELECT c FROM Customer c WHERE c.custPhone = :custPhone")
    , @NamedQuery(name = "Customer.findByCustCnic", query = "SELECT c FROM Customer c WHERE c.custCnic = :custCnic")
    , @NamedQuery(name = "Customer.findByCustEmail", query = "SELECT c FROM Customer c WHERE c.custEmail = :custEmail")})
public class Customer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private BigDecimal custId;
    @Column(name = "AGENT_ID")
    private BigInteger agentId;
    @Column(name = "CITY_CODE")
    private String cityCode;
    @Column(name = "CUST_NAME")
    private String custName;
    @Column(name = "CUST_USER")
    private String custUser;
    @Column(name = "CUST_PASS")
    private String custPass;
    @Column(name = "CUST_PHONE")
    private String custPhone;
    @Column(name = "CUST_CNIC")
    private Long custCnic;
    @Column(name = "CUST_EMAIL")
    private String custEmail;

    public Customer() {
    }

    public Customer(BigDecimal custId) {
        this.custId = custId;
    }

    public BigDecimal getCustId() {
        return custId;
    }

    public void setCustId(BigDecimal custId) {
        BigDecimal oldCustId = this.custId;
        this.custId = custId;
        changeSupport.firePropertyChange("custId", oldCustId, custId);
    }

    public BigInteger getAgentId() {
        return agentId;
    }

    public void setAgentId(BigInteger agentId) {
        BigInteger oldAgentId = this.agentId;
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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        String oldCustName = this.custName;
        this.custName = custName;
        changeSupport.firePropertyChange("custName", oldCustName, custName);
    }
    public String getCustUser() {
        return custUser;
    }

    public void setCustUser(String custUser) {
        String oldCustUser = this.custUser;
        this.custUser = custUser;
        changeSupport.firePropertyChange("custUser", oldCustUser, custUser);
    }
    public String getCustPass() {
        return custPass;
    }

    public void setCustPass(String custPass) {
        String oldCustPass = this.custPass;
        this.custPass = custPass;
        changeSupport.firePropertyChange("custPass", oldCustPass, custPass);
    }
    
    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        String oldCustPhone = this.custPhone;
        this.custPhone = custPhone;
        changeSupport.firePropertyChange("custPhone", oldCustPhone, custPhone);
    }

    public Long getCustCnic() {
        return custCnic;
    }

    public void setCustCnic(Long custCnic) {
        Long oldCustCnic = this.custCnic;
        this.custCnic = custCnic;
        changeSupport.firePropertyChange("custCnic", oldCustCnic, custCnic);
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        String oldCustEmail = this.custEmail;
        this.custEmail = custEmail;
        changeSupport.firePropertyChange("custEmail", oldCustEmail, custEmail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gui.Customer[ custId=" + custId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
