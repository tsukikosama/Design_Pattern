package org.weilai.StructureMode.Adapter.entity;

import java.util.Date;

public class RebateInfo {
 private String userId; // ⽤户ID
 private String bizId; // 业务ID
 private String bizTime; // 业务时间
 private String desc; // 业务描述

 public String getUserId() {
  return userId;
 }

 public void setUserId(String userId) {
  this.userId = userId;
 }

 public String getBizId() {
  return bizId;
 }

 public void setBizId(String bizId) {
  this.bizId = bizId;
 }

 public String getBizTime() {
  return bizTime;
 }

 public void setBizTime(String bizTime) {
  this.bizTime = bizTime;
 }

 public String getDesc() {
  return desc;
 }

 public void setDesc(String desc) {
  this.desc = desc;
 }


 @Override
 public String toString() {
  return "RebateInfo{" +
          "userId='" + userId + '\'' +
          ", bizId='" + bizId + '\'' +
          ", bizTime='" + bizTime + '\'' +
          ", desc='" + desc + '\'' +
          '}';
 }
}