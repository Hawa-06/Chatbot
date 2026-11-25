package org.ldv.talkinghawa.dto.mistral

data class MistralChatRequest(
    val model: String,
    val messages: List<MistralMessage>
)