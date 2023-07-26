package otus.homework.flowcats

sealed class Result {
    class Success(val fact: Fact): Result()
    class Error(val msg: String): Result()
    class Loading(): Result()
}