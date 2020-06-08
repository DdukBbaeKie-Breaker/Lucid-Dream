package com.lucid.dream.domain.payload.request;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class CovidRequest {

    private int resultCode;

    private String resultMsg;

    private int numOfRows;

    private int pageNo;

    private int totalCount;

    private int SEQ;

    private Long STATE_DT;

    private Date STATE_TIME;

    private Long DECIDE_CNT;

    private Long CLEAR_CNT;

    private Long EXAM_CNT;

    private Long DEATH_CNT;

    private Long CARE_CNT;

    private Long RESUTL_NEG_CNT;

    private Long ACC_EXAM_CNT;

    private Long ACC_EXAM_COMP_CNT;

    private float ACC_DEF_RATE;

    private Date CREATE_DT;

    private Integer UPDATE_DT;
}
