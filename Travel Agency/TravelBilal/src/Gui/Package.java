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
@Table(name = "PACKAGE", catalog = "", schema = "JUHM")
@NamedQueries({
    @NamedQuery(name = "Package.findAll", query = "SELECT p FROM Package p")
    , @NamedQuery(name = "Package.findByPkgId", query = "SELECT p FROM Package p WHERE p.pkgId = :pkgId")
    , @NamedQuery(name = "Package.findByTrpId", query = "SELECT p FROM Package p WHERE p.trpId = :trpId")
    , @NamedQuery(name = "Package.findByDestination", query = "SELECT p FROM Package p WHERE p.destination = :destination")
    , @NamedQuery(name = "Package.findBySource", query = "SELECT p FROM Package p WHERE p.source = :source")
    , @NamedQuery(name = "Package.findByCapacity", query = "SELECT p FROM Package p WHERE p.capacity = :capacity")
    , @NamedQuery(name = "Package.findByDuration", query = "SELECT p FROM Package p WHERE p.duration = :duration")
    , @NamedQuery(name = "Package.findByAmount", query = "SELECT p FROM Package p WHERE p.amount = :amount")})
public class Package implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PKG_ID")
    private BigDecimal pkgId;
    @Column(name = "TRP_ID")
    private BigInteger trpId;
    @Column(name = "DESTINATION")
    private String destination;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "CAPACITY")
    private BigInteger capacity;
    @Column(name = "DURATION")
    private BigInteger duration;
    @Column(name = "AMOUNT")
    private BigInteger amount;

    public Package() {
    }

    public Package(BigDecimal pkgId) {
        this.pkgId = pkgId;
    }

    public BigDecimal getPkgId() {
        return pkgId;
    }

    public void setPkgId(BigDecimal pkgId) {
        BigDecimal oldPkgId = this.pkgId;
        this.pkgId = pkgId;
        changeSupport.firePropertyChange("pkgId", oldPkgId, pkgId);
    }

    public BigInteger getTrpId() {
        return trpId;
    }

    public void setTrpId(BigInteger trpId) {
        BigInteger oldTrpId = this.trpId;
        this.trpId = trpId;
        changeSupport.firePropertyChange("trpId", oldTrpId, trpId);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        String oldDestination = this.destination;
        this.destination = destination;
        changeSupport.firePropertyChange("destination", oldDestination, destination);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        String oldSource = this.source;
        this.source = source;
        changeSupport.firePropertyChange("source", oldSource, source);
    }

    public BigInteger getCapacity() {
        return capacity;
    }

    public void setCapacity(BigInteger capacity) {
        BigInteger oldCapacity = this.capacity;
        this.capacity = capacity;
        changeSupport.firePropertyChange("capacity", oldCapacity, capacity);
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        BigInteger oldDuration = this.duration;
        this.duration = duration;
        changeSupport.firePropertyChange("duration", oldDuration, duration);
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        BigInteger oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkgId != null ? pkgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.pkgId == null && other.pkgId != null) || (this.pkgId != null && !this.pkgId.equals(other.pkgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gui.Package[ pkgId=" + pkgId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
