package ru.netology

fun main() {
    val likes = 61
    val printLikes =
        if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $printLikes")

    when {
        likes == 0 -> println("Никто не лайкнул этот пост")
        likes < 10 -> println("Этот пост не набрал много лайков")
        likes < 100 -> println("У этого поста достаточно лайков")
        else -> println("В этом посте много лайков")
    }
}


