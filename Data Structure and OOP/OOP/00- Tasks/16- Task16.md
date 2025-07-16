# Task: Advanced Interface Implementation 

## Objective
Implement a complex scenario using interfaces  to model a messaging application with different message types and recipients.

## Requirements

1. Create an interface named `Message` with the following methods:
   - `void send(String recipient)`: Sends the message to the specified recipient.
   - `String getMessageType()`: Returns the type of the message.

2. Create two interfaces named `TextMessage` and `VoiceMessage` that extend the `Message` interface and add the following methods:
   - `void setText(String text)`: Sets the text content of the message (for `TextMessage`).
   - `void setVoice(String voice)`: Sets the voice content of the message (for `VoiceMessage`).

3. Create classes that implement the `TextMessage` and `VoiceMessage` interfaces:
   - `TextMessageImpl` should implement `TextMessage` and include a method to get the text content.
   - `VoiceMessageImpl` should implement `VoiceMessage` and include a method to get the voice content.

4. Create a class named `MessagingApp` that contains a list of `Message` objects and demonstrates the use of the interfaces and implementations by:
   - Adding instances of `TextMessageImpl` and `VoiceMessageImpl` to the list.
   - Iterating over the list and sending each message to a recipient.
   - Printing the message type and content for each message sent.

### Knowledge requirements
- interface

