package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class ModeleIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var nom: String,
    var urlAPI: String,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    var cheminLogo: String,

    @ManyToOne
    @JoinColumn(name = "fourniseur_ia_id")
    var fourniseurIA: FourniseurIA? = null
)