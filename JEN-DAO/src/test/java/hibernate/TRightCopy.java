package hibernate;
// Generated 2016-12-27 17:26:25 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TRightCopy generated by hbm2java
 */
@Entity
@Table(name = "t_right_copy", catalog = "sendb")
public class TRightCopy implements java.io.Serializable {

	private Long rightId;
	private String rightCode;
	private Long rightParentId;
	private Short rightOrder;
	private String rightName;
	private String rightUrl;
	private short status;
	private String remark;
	private Long createUserid;
	private Date createTime;
	private Long updateUserid;
	private Date updateTime;

	public TRightCopy() {
	}

	public TRightCopy(short status) {
		this.status = status;
	}

	public TRightCopy(String rightCode, Long rightParentId, Short rightOrder, String rightName, String rightUrl,
			short status, String remark, Long createUserid, Date createTime, Long updateUserid, Date updateTime) {
		this.rightCode = rightCode;
		this.rightParentId = rightParentId;
		this.rightOrder = rightOrder;
		this.rightName = rightName;
		this.rightUrl = rightUrl;
		this.status = status;
		this.remark = remark;
		this.createUserid = createUserid;
		this.createTime = createTime;
		this.updateUserid = updateUserid;
		this.updateTime = updateTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "right_id", unique = true, nullable = false)
	public Long getRightId() {
		return this.rightId;
	}

	public void setRightId(Long rightId) {
		this.rightId = rightId;
	}

	@Column(name = "right_code", length = 50)
	public String getRightCode() {
		return this.rightCode;
	}

	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
	}

	@Column(name = "right_parent_id")
	public Long getRightParentId() {
		return this.rightParentId;
	}

	public void setRightParentId(Long rightParentId) {
		this.rightParentId = rightParentId;
	}

	@Column(name = "right_order")
	public Short getRightOrder() {
		return this.rightOrder;
	}

	public void setRightOrder(Short rightOrder) {
		this.rightOrder = rightOrder;
	}

	@Column(name = "right_name", length = 50)
	public String getRightName() {
		return this.rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	@Column(name = "right_url")
	public String getRightUrl() {
		return this.rightUrl;
	}

	public void setRightUrl(String rightUrl) {
		this.rightUrl = rightUrl;
	}

	@Column(name = "status", nullable = false)
	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	@Column(name = "remark", length = 300)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "create_userid")
	public Long getCreateUserid() {
		return this.createUserid;
	}

	public void setCreateUserid(Long createUserid) {
		this.createUserid = createUserid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "update_userid")
	public Long getUpdateUserid() {
		return this.updateUserid;
	}

	public void setUpdateUserid(Long updateUserid) {
		this.updateUserid = updateUserid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
