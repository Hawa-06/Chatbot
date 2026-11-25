package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class FourniseurIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var nom: String,
    var cheminLogo: String,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    @OneToMany(mappedBy = "fourniseurIA", cascade = [CascadeType.ALL], orphanRemoval = true)
    var modeles: MutableList<ModeleIA> = mutableListOf()
)