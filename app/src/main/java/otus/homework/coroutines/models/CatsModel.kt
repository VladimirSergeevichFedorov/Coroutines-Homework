package otus.homework.coroutines.models

import otus.homework.coroutines.network.models.CatsImage
import otus.homework.coroutines.network.models.Fact

data class CatsModel(
    val catsImage: List<CatsImage>,
    val fact: Fact
)
