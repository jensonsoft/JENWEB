package com.jen.sen.persistence.pojo.system;
// Generated 2016-5-25 16:02:32 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TRoleRight generated by hbm2java
 */
@Entity
@Table(name = "t_role_right", catalog = "sendb")
public class TRoleRight implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long roriId;
	private TRight TRight;
	private TRoles TRoles;
	private Long createUserid;
	private Date createTime;
	private Long updateUserid;
	private Date updateTime;

	public TRoleRight() {
	}

	public TRoleRight(TRight TRight, TRoles TRoles) {
		this.TRight = TRight;
		this.TRoles = TRoles;
	}

	public TRoleRight(TRight TRight, TRoles TRoles, Long createUserid, Date createTime, Long updateUserid,
			Date updateTime) {
		this.TRight = TRight;
		this.TRoles = TRoles;
		this.createUserid = createUserid;
		this.createTime = createTime;
		this.updateUserid = updateUserid;
		this.updateTime = updateTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "rori_id", unique = true, nullable = false)
	public Long getRoriId() {
		return this.roriId;
	}

	public void setRoriId(Long roriId) {
		this.roriId = roriId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "right_id", nullable = false)
	public TRight getTRight() {
		return this.TRight;
	}

	public void setTRight(TRight TRight) {
		this.TRight = TRight;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public TRoles getTRoles() {
		return this.TRoles;
	}

	public void setTRoles(TRoles TRoles) {
		this.TRoles = TRoles;
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
