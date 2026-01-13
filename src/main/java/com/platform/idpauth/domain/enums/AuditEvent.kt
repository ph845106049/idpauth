package com.platform.idpauth.domain.enum

public enum class AuditEvent(desc: String) {
    LOGIN("登录"),
    LOGOUT("登出"),
    REGISTER("注册"),
    USERINFO("获取用户信息"),
    REFRESH_TOKEN("刷新令牌");

    private val desc: String?

    init {
        this.desc = desc
    }

    fun desc(): String? {
        return desc
    }
}
