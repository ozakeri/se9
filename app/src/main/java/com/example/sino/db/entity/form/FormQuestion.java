package com.example.sino.db.entity.form;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.sino.utils.converters.ChatGroupMemberListConverter;
import com.example.sino.utils.converters.FormItemAnswerConverter;
import com.example.sino.utils.converters.FormTempConverter;

import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "FORM_QUESTION".
 */

@Entity(tableName = "FormQuestion")
public class FormQuestion {
    @PrimaryKey(autoGenerate = true)
    private Long id;
    private String question;
    private Integer answerTypeEn;
    private Integer answerInt;
    private String answerStr;
    private Long serverAnswerId;
    private String inputValuesDefault;
    private Long formId;
    private long formQuestionGroupId;
    @TypeConverters({FormItemAnswerConverter.class})
    private List<FormItemAnswer> formAnswerListFormQuestion;
    @TypeConverters({FormTempConverter.class})
    private List<FormTemp> formTempListFormQuestion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getAnswerTypeEn() {
        return answerTypeEn;
    }

    public void setAnswerTypeEn(Integer answerTypeEn) {
        this.answerTypeEn = answerTypeEn;
    }

    public Integer getAnswerInt() {
        return answerInt;
    }

    public void setAnswerInt(Integer answerInt) {
        this.answerInt = answerInt;
    }

    public String getAnswerStr() {
        return answerStr;
    }

    public void setAnswerStr(String answerStr) {
        this.answerStr = answerStr;
    }

    public Long getServerAnswerId() {
        return serverAnswerId;
    }

    public void setServerAnswerId(Long serverAnswerId) {
        this.serverAnswerId = serverAnswerId;
    }

    public String getInputValuesDefault() {
        return inputValuesDefault;
    }

    public void setInputValuesDefault(String inputValuesDefault) {
        this.inputValuesDefault = inputValuesDefault;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public long getFormQuestionGroupId() {
        return formQuestionGroupId;
    }

    public void setFormQuestionGroupId(long formQuestionGroupId) {
        this.formQuestionGroupId = formQuestionGroupId;
    }

    public List<FormItemAnswer> getFormAnswerListFormQuestion() {
        return formAnswerListFormQuestion;
    }

    public void setFormAnswerListFormQuestion(List<FormItemAnswer> formAnswerListFormQuestion) {
        this.formAnswerListFormQuestion = formAnswerListFormQuestion;
    }

    public List<FormTemp> getFormTempListFormQuestion() {
        return formTempListFormQuestion;
    }

    public void setFormTempListFormQuestion(List<FormTemp> formTempListFormQuestion) {
        this.formTempListFormQuestion = formTempListFormQuestion;
    }
}