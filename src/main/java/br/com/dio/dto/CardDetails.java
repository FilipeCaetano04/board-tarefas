package br.com.dio.dto;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public record CardDetails(Long id,
                          boolean blocked,
                          OffsetDateTime blockedAt,
                          String blockReason,
                          int blocksAmount,
                          Long columnId,
                          String columnName) {

}
