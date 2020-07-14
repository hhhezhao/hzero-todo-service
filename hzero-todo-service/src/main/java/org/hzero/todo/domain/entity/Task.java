package org.hzero.todo.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.choerodon.mybatis.domain.AuditDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @Author : HZ
 * @Date: 2020-07-14 20:01
 */
@ApiModel("任务信息")
@Data
@ModifyAudit
@VersionAudit
@Table(name = "todo_task")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task  extends AuditDomain {
    public static final String FIELD_ID = "id";
    public static final String FIELD_EMPLOYEE_ID = "employeeId";
    public static final String FIELD_STATE = "state";
    public static final String FIELD_TASK_DESCRIPTION = "taskDescription";

    @Id
    @GeneratedValue
    private Long id;
    @NotNull(message = "用户ID不能为空")
    @ApiModelProperty("用户ID")
    private Long employeeId;
    @ApiModelProperty("任务状态")
    private String state;
    @ApiModelProperty("任务编号")
    private String taskNumber;
    @Length(max = 240)
    @ApiModelProperty("任务描述")
    private String taskDescription;
    @NotNull
    @ApiModelProperty("租户ID")
    private Long tenantId;

    @Transient
    @ApiModelProperty("员工编号")
    private String employeeNumber;
    @Transient
    @ApiModelProperty("员工姓名")
    private String employeeName;

    /**
     * 生成任务编号
     */
    public void generateTaskNumber() {
        this.taskNumber = UUID.randomUUID().toString().replace("-", "");
    }
}
