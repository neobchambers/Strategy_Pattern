# Strategy_Pattern

## Description

This project demonstrates the Strategy design pattern using a calculator. It supports three interchangeable operations: addition, subtraction, and multiplication.

## Project Structure

- `OperationStrategy` — common strategy interface.
- `AddStrategy` — performs addition.
- `SubtractStrategy` — performs subtraction.
- `MultiplyStrategy` — performs multiplication.
- `Calculator` — context that executes the selected strategy.
- `Main` — client that demonstrates runtime strategy switching.

## Expected Output

Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0


## How to Add a New Strategy

1. Create a class that implements `OperationStrategy`.
2. Implement the `execute()` method.
3. Pass an instance of the new strategy to `Calculator` using `setStrategy()`.

The existing `Calculator` class does not need to be modified.
