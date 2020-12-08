package model

data class Track(
    val id: Int,
    val name: String,
    val notes: List<Note>,
    val pitchData: PitchData? = null
)

// X - Tick; Y - Offset in semitone; Only contains changing point
typealias PitchData = List<Pair<Long, Double>>
