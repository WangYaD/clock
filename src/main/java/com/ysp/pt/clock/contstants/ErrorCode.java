package com.ysp.pt.clock.contstants;

public enum ErrorCode {
  SERVER_ERROR("999", "服务异常"),
  SAVE_ROWID_NOTfIND("S002","RowId不存在"),
  NOT_FIND_OPERATETYPE("N001","非法操作请重试"),
  SYS_INCLOE_ERROR("S002","消息格式不正确")
  ;
  private String error_code;
  private String msg;

  ErrorCode(String code, String msg) {
    this.error_code = code;
    this.msg = msg;
  }

  public String getError_code() {
    return error_code;
  }

  public String getMsg() {
    return msg;
  }
}
