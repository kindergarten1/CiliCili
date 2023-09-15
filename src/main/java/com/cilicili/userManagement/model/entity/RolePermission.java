package com.cilicili.userManagement.model.entity;



import com.cilicili.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;


/**
 * @Author SlyAimer
 * @Date 2023/8/26 20:41
 * @Version 1.0
 */

@Data
@Entity
@Table(name = "role_permission")
@EqualsAndHashCode(callSuper = true)
@Schema(name = "角色权限")
public class RolePermission extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(name = "菜单权限ID")
    private String permissionId;

    @Schema(name = "角色ID")
    private String roleId;
}