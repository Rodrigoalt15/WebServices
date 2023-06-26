package com.ujobs.WebServices.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePrivateChatDto {
    private Long user1Id;
    private Long user2Id;
}
