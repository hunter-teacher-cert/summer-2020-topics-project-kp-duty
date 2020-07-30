# Topic: Bitcoin

# Lesson Topics / Objectives:
### 1. How does a Merkle Tree allow us to identify alterations to a group of data?
### 2. How can we create an algorithm to generate a nonce value that satisfies a given requirement (aka Proof of Work)

## Background
Students have been introduced to the SHA256 website and are able to create a loop which runs until a conditional is met. Students have created their blockchain coding assignments and in these assignments we further explore how hash values are further implemented in bitcoins through the use of a Merkle tree and a Proof of work.

## Vocabulary
* Hash (Digest)
* Merkle Tree (Binary Hash Tree)
* Proof of Work
* Nonce - number used once
* Runtime / Computational Time

---


# 1. Merkle Trees and Root

## Activity *[no coding]*
Students will create a Merkle Root from hash values based on 4 unique data inputs using SHA256.
*Directions are on the handout.*

### Materials
* [Merkle Student Handout.pdf](Merkel%20Student%20Handout.pdf)
* [Merkle Handout Answers.pdf](Merkel%20Handout%20Answers.pdf)
* [Suggested SHA256 Hash Generator](https://emn178.github.io/online-tools/sha256.html)

### Additional Resources for Teaching & Learning
**Videos:**
* [Blockchain Basics Explained - Hashes with Mining and Merkle trees](https://www.youtube.com/watch?v=lik9aaFIsl4)  - A short and sweet explanation of Merkle tree. The activity is based off this video. Recommend that you watch this with students!
* [The Blockchain & Bitcoin - Computerphile](https://www.youtube.com/watch?v=qcuc3rgwZAE)  - A bit more technical, recommended that the teacher watches it all the way through. Maybe good for HW.
* [Bitcoin and cryptocurrency mining explained](https://www.youtube.com/watch?v=kZXXDp0_R-w)  - Focuses a little more on the cryptography of hash functions


---


# 2. Proof of Work

## Activity *[coding]*
Proof of Work (Dumplings) -
Given a coding framework to generate a hash value using SHA256, students will create a method to find a nonce value that generates a hash value with a given difficulty. The difficulty in Bitcoin mining is set by requiring a certain number of leading zeros in the final hash value for the block.

### Materials
* [ProofOfDumplings.java](ProofOfDumplings.java)  - Starter code for students.
* [ProofOfDumplingsSolution.java](ProofOfDumplingsSolution.java)  - A sample solution with timer to demonstrate runtime.
* [SHA256.java](SHA256.java)  - A class with the static method `calculateHash(data)` that students can use in a bigger project - i.e. - they can call `SHA256.calculateHash(data)`.

### Additional Resources for Teaching & Learning
Video:
* [Blockchain Basics Explained - Hashes with Mining and Merkle trees](https://www.youtube.com/watch?v=lik9aaFIsl4)  - *Start at time 11:44 to help introduce this activity*


How to include SHA256 in a Java program:
* [www.baeldung.com/sha-256-hashing-java](https://www.baeldung.com/sha-256-hashing-java)
* [geeksforgeeks.org/sha-256-hash-in-java/](https://www.geeksforgeeks.org/sha-256-hash-in-java/)


## Extenions:
*For students that have made a Block & Blockchain implementation in code, keep going!*
* Add a Merkle Root, nonce, and Signature Hash variables to the Block class. Then include your nonce generator (or Proof of Work) method to the Block class or make a Miner class.
* Students can try to go even further to create a more robust Bitcoin implementation. See [Savjee Simply Explained](https://www.savjee.be/2018/02/Transactions-and-mining-rewards/) for more ideas and to see sample code in Javascript.