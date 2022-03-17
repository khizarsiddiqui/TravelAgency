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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Hamza
 */
@Entity
@Table(name = "BOOKING", catalog = "", schema = "JUHM")
@NamedQueries({
    @NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
    , @NamedQuery(name = "Booking.findByBookId", query = "SELECT b FROM Booking b WHERE b.bookId = :bookId")
    , @NamedQuery(name = "Booking.findByCustId", query = "SELECT b FROM Booking b WHERE b.custId = :custId")
    , @NamedQuery(name = "Booking.findByAgentId", query = "SELECT b FROM Booking b WHERE b.agentId = :agentId")
    , @NamedQuery(name = "Booking.findByPkgId", query = "SELECT b FROM Booking b WHERE b.pkgId = :pkgId")
    , @NamedQuery(name = "Booking.findByTrpId", query = "SELECT b FROM Booking b WHERE b.trpId = :trpId")
    , @NamedQuery(name = "Booking.findByDestination", query = "SELECT b FROM Booking b WHERE b.destination = :destination")
    , @NamedQuery(name = "Booking.findBySource", query = "SELECT b FROM Booking b WHERE b.source = :source")
    , @NamedQuery(name = "Booking.findByDeptDay", query = "SELECT b FROM Booking b WHERE b.deptDay = :deptDay")
    , @NamedQuery(name = "Booking.findByArrvlDay", query = "SELECT b FROM Booking b WHERE b.arrvlDay = :arrvlDay")
    , @NamedQuery(name = "Booking.findByNoOfppl", query = "SELECT b FROM Booking b WHERE b.noOfppl = :noOfppl")
    , @NamedQuery(name = "Booking.findByPaymStatus", query = "SELECT b FROM Booking b WHERE b.paymStatus = :paymStatus")
    , @NamedQuery(name = "Booking.findByAmount", query = "SELECT b FROM Booking b WHERE b.amount = :amount")})
public class Booking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "BOOK_ID")
    private BigDecimal bookId;
    @Column(name = "CUST_ID")
    private BigInteger custId;
    @Column(name = "AGENT_ID")
    private BigInteger agentId;
    @Column(name = "PKG_ID")
    private BigInteger pkgId;
    @Column(name = "TRP_ID")
    private BigInteger trpId;
    @Column(name = "DESTINATION")
    private String destination;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "DEPT_DAY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deptDay;
    @Column(name = "ARRVL_DAY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrvlDay;
    @Column(name = "NO_OFPPL")
    private BigInteger noOfppl;
    @Column(name = "PAYM_STATUS")
    private String paymStatus;
    @Column(name = "AMOUNT")
    private BigInteger amount;

    public Booking() {
    }

    public Booking(BigDecimal bookId) {
        this.bookId = bookId;
    }

    public BigDecimal getBookId() {
        return bookId;
    }

    public void setBookId(BigDecimal bookId) {
        BigDecimal oldBookId = this.bookId;
        this.bookId = bookId;
        changeSupport.firePropertyChange("bookId", oldBookId, bookId);
    }

    public BigInteger getCustId() {
        return custId;
    }

    public void setCustId(BigInteger custId) {
        BigInteger oldCustId = this.custId;
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

    public BigInteger getPkgId() {
        return pkgId;
    }

    public void setPkgId(BigInteger pkgId) {
        BigInteger oldPkgId = this.pkgId;
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

    public Date getDeptDay() {
        return deptDay;
    }

    public void setDeptDay(Date deptDay) {
        Date oldDeptDay = this.deptDay;
        this.deptDay = deptDay;
        changeSupport.firePropertyChange("deptDay", oldDeptDay, deptDay);
    }

    public Date getArrvlDay() {
        return arrvlDay;
    }

    public void setArrvlDay(Date arrvlDay) {
        Date oldArrvlDay = this.arrvlDay;
        this.arrvlDay = arrvlDay;
        changeSupport.firePropertyChange("arrvlDay", oldArrvlDay, arrvlDay);
    }

    public BigInteger getNoOfppl() {
        return noOfppl;
    }

    public void setNoOfppl(BigInteger noOfppl) {
        BigInteger oldNoOfppl = this.noOfppl;
        this.noOfppl = noOfppl;
        changeSupport.firePropertyChange("noOfppl", oldNoOfppl, noOfppl);
    }

    public String getPaymStatus() {
        return paymStatus;
    }

    public void setPaymStatus(String paymStatus) {
        String oldPaymStatus = this.paymStatus;
        this.paymStatus = paymStatus;
        changeSupport.firePropertyChange("paymStatus", oldPaymStatus, paymStatus);
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
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gui.Booking[ bookId=" + bookId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
