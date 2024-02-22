package com.iche.letschat.dto.response;

import com.iche.letschat.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String Sender;
    private MessageType type;
}
