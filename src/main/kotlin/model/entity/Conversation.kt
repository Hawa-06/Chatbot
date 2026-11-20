package org.ldv.chatbot.model.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Conversation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var titre: String,
    var dateCreation: LocalDateTime = LocalDateTime.now(),

    @ManyToOne
    @JoinColumn(name = "modele_ia_id")
    var modeleIA: ModeleIA? = null,

    @OneToMany(mappedBy = "conversation", cascade = [CascadeType.ALL], orphanRemoval = true)
    var messages: MutableList<Message> = mutableListOf()
)