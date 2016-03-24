package com.hbuas.pojo;
import java.io.InputStream;
import java.sql.Date;
/**
 * Created by dell on 2016/1/24.
 */
public class User {
    private String name;//用户的姓名
    private String sex;//性别
    private Date birth;//用户的生日
    private String certificateType;//证件类型
    private String certificateNumber;//证件号码
    private String password;//登录密码
    private String mobileNumber;//手机号码
    private String headPicPath;//用户头像路径
    private String eMail;//用户的电子邮箱
    private String area;//用户所在辖区
    private String idCardNumber;//身份证号
    private String nation;//用户的民族
    private String educationLevel;//用户受教育的程度
    private String politicsStatus;//用户的政治面貌
    private String organization;//用户所在组织（第一）
    private String callNumber;//用户的座机号
    private String QQ;//用户的QQ号
    private String weChat;//用户的微信号
    private String street;//用户所在街道
    private String community;//用户所在社区
    private String contactAddress;//用户联系地址
    private String serverDeclaration;//用户服务宣言
    private String serverType;//用户服务的类型
    private Date dateOfSAI;//用户志愿证件照认证的时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    public String getHeadPicPath() {
        return headPicPath;
    }

    public void setHeadPicPath(String headPicPath) {
        this.headPicPath = headPicPath;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getServerDeclaration() {
        return serverDeclaration;
    }

    public void setServerDeclaration(String serverDeclaration) {
        this.serverDeclaration = serverDeclaration;
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public Date getDateOfSAI() {
        return dateOfSAI;
    }

    public void setDateOfSAI(Date dateOfSAI) {
        this.dateOfSAI = dateOfSAI;
    }
}
