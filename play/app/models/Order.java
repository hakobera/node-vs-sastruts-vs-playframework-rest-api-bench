package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import play.db.jpa.GenericModel;

@Entity
@Table(name = "orders")
public class Order extends GenericModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(length = 36)
	public String tennatId;
	
	@Version
	public Integer versionNo;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdAt;
	
	public String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date modifiedAt;
	
	public String modifiedBy;
	
	@Column(length = 36)
	public String locationId;
	
	@Column(length = 36)
	public String sourceId;
	
	@Column(length = 36)
	public String treatmentId;
	
	@Column(length = 50)
	public String poNumber;

	@Column(length = 255)
	public String notes;
	
	public Boolean closed;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date closedAt;
	
	public String closedBy;
	
}
