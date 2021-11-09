package com.christiangalera.motivation.repository

import com.christiangalera.motivation.infra.MotivationConstants
import java.util.*
import java.util.concurrent.Phaser

data class Phrase (val description: String, val category: Int)

class Mock {
    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Respire fundo e fique atento às surpresas deliciosas que a vida preparou para você!", MORNING),
        Phrase("Devíamos ser ensinados a não esperar por inspiração para começar algo. Ação sempre gera inspiração. Inspiração raramente gera ação.", MORNING),
        Phrase("Não importa que você vá devagar, contanto que você não pare.", MORNING),
        Phrase("Toda manhã você tem duas escolhas: continuar dormindo com seus sonhos ou acordar e persegui-los!", MORNING),
        Phrase("Comece fazendo o que é necessário, depois o que é possível, e de repente você estará fazendo o impossível.", MORNING),
        Phrase("Suba o primeiro degrau com fé. Não é necessário que você veja toda a escada, apenas dê o primeiro passo.", MORNING),
        Phrase("O pessimismo nunca venceu nenhuma batalha", HAPPY),
        Phrase("Tudo tem começo e meio. O fim só existe para quem não percebe o recomeço.", HAPPY),
        Phrase("Quer você acredite que consiga fazer uma coisa ou não, você está certo.", HAPPY),
        Phrase("Há pessoas que choram por saber que as rosas têm espinho. Há outras que sorriem por saber que os espinhos têm rosas!", HAPPY),
        Phrase("E se você tiver 1% de chance, tenha 99% de fé.", HAPPY),
        Phrase("Vencer a preguiça é a primeira coisa que o homem deve procurar, se quiser ser dono do seu destino.", HAPPY)
    )

    fun getPhrase(categoryId: Int) : String {

        val filtered = mListPhrases.filter { (it.category == categoryId || categoryId == ALL) }
        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }

}