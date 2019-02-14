Demonstrating an issue when using both @Async and @Transactional on a method.

https://stackoverflow.com/questions/54663026/async-and-transaction-aspect-order

After application start, navigate to localhost:8080/test. After that, the logs will then show an exception `You're trying to execute a streaming query method without a surrounding transaction..`. 