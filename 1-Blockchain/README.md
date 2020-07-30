# Lesson Topics:
### 1. When should we use Blockchain?
### 2. How does Blockchain work?

## Background
Blockchain technology is useful wherever we need a secure record of data that is distributed (not stored in one place or controlled by one party). There are many things that make it secure, but that is not the focus of this lesson. Students should focus on the why and the how in this lesson: *Why is blockchain technology useful? How can it improve how we do things?*

### Vocabulary
* Blockchain
* Block
* Hash algorithm and value
* Decentralized & Distributed networks

---

# 1. When should we use Blockchain?

## Objectives:
Students will demonstrate their understanding of blockchain technology by determining a possible application for blockchain technology in their lives and writing / presenting a proposal explaining how blockchain would improve the current system.

## Grade-level / Class:
* AP Computer Science Principles - This could be an exploration of an emerging technology and its impact on society
* AP Computer Science A - This could be a project delved into after the AP exam.


## Activity
*Mini-Project - 2 days*
Write and present a proposal for a new way to use blockchain technology to improve how we do things. Include a detailed explanation of how you think blockchain will help improve the current system that is in place. Poster/slides/diagrams/pictures are optional, but suggested.

Day 1:
1. Watch this with the whole class or assign for HW before class:
[Understand the Blockchain in Two Minutes](https://www.youtube.com/watch?v=r43LhSUUGTQ)
2. Jigsaw Activity - Have different students read different arcticles from [Blockchain Futures Lab](https://blockchainfutureslab.wordpress.com/). Then have them share out.
3. Brainstorm and share with a Binary Think Tree - Individually, students will brainstorm ideas for how a blockchain could help improve how something is done in their lives or in the world. The have them share in pairs and decide on one idea they think is best. Repeat for groups of 4, 8, etc. until you feel the groups are large enough. Call on groups however you will to share out which idea(s) they decided on.
4. Confirm that the ideas could use Blockchain technology with the [Blockchain Decision Tree](Blockchain%20Descision%20Tree%20-%20from%20spectrum.ieee.org.jpeg).

**Blockchain Decision Tree:**

<p align="center">
	<img src="Blockchain Descision Tree - from spectrum.ieee.org.jpeg" alt="Decision Tree" width=500/>
</p>

5. Introduce the project.
6. HW - Watch one more video - [How Blockchain is Already Taking Over](https://www.youtube.com/watch?v=kP6EezXJKNM)

Day 2 - or possible HW with check in for some students:
1. Check in with students to see how they want to apply blockchain.
2. Have students pair up and use the **Blockchain Desicion Tree** to help validate their application.
3. Start creating proposal, posters, etc.
4. Present as soon as possible with your choice of feedback protocols in place.


## Suggested Resources & Materials

### Primary (use these!)
* [Understand the Blockchain in Two Minutes](https://www.youtube.com/watch?v=r43LhSUUGTQ)
* [Blockchain Futures Lab](https://blockchainfutureslab.wordpress.com/)
* [How Blockchain is Already Taking Over](https://www.youtube.com/watch?v=kP6EezXJKNM)
* [Blockchain Decision Tree](Blockchain%20Descision%20Tree%20-%20from%20spectrum.ieee.org.jpeg)
* Some students may want to look into [Smart Contracts](https://www.investopedia.com/terms/s/smart-contracts.asp)

### Secondary (for additional info)
* [TED Talks: The Blockchain Explained Simply](https://www.youtube.com/watch?v=KP_hGPQVLpA)
* [Blockchain Expert Explains Once Concept in 5 Levels of Difficulty | WIRED](https://www.youtube.com/watch?v=hYip_Vuv8J0)
* [Do You Need a Blockchain? - IEEE Article - also source of Decision Tree](https://spectrum.ieee.org/computing/networks/do-you-need-a-blockchain)
* [Do you need a Blockchain? - Academic Article](https://eprint.iacr.org/2017/375.pdf)

---

## Recommended transition before the next lesson

### An unplugged (with calculators and excel) activity.

** [https://www.instructables.com/id/The-Blockchain-Game/](https://www.instructables.com/id/The-Blockchain-Game/) **

There are printables and instructions along with a sample run-through video on the site.

---


# 2. How does Blockchain work?

## Objectives:
Students will demonstrate their knowledge of blockchain technology by writing an implementation of their blockchain idea in their language of choice.

## Grade-level / Class:
* Intro CS course - Students can code this in Python or Javascript after they learn classes
* AP Computer Science A - This could be a project delved into after the AP exam OR used to reinforce classes and arrays / ArrayLists.

## Activity
Write a program in [insert language here] that implements a Block class and Blockchain class to model your blockchain idea.
The implementation should a include:
* A Block class - that contains all the necessary data for their idea
* A Blockchain class - that will somehow store Blocks
* Code that creates their blockchain with some sample blocks

** AP CS A classes can use [this SHA256 class](../2-Bitcoin/SHA256.java) that has a static calculateHash(data) method written in Java.

1. Use the [presentation slides](../Blockchain%20Presentation.pdf) linked in the root folder to explain how blockchains work.
2. Brainstorm key points that are needed in each:
* Block class  - *what data are you going to store? how are you going to determine the signature hash for each block?*
* Blockchain class  - *how are you going to store all of the blocks?*
3. Students should subgoal label the different parts of each class they are going to write and then compare with a classmate.
4. Give students time to write their code while providing any necessary supports. Scaffold as you see fit.

## Suggested Resources & Materials

### Primary (use these!)
* Go through all of [Savjee's blog and videos](https://www.savjee.be/2017/07/Writing-tiny-blockchain-in-JavaScript/) for how he make a blockchain in Javascript before you have your class do it in your language of choice.
* Our [presentation slides](../Blockchain%20Presentation.pdf)  - can be used with some modification or if you plan out your dialogue. We were purposefully sparse on text. There are links all throughout the slides that can also be used.
* An alternative to the slides - [an infographic website on blockchain by Reuters](http://graphics.reuters.com/TECHNOLOGY-BLOCKCHAIN/010070P11GN/index.html)  - some nice animations along with text and images.

### Java Code for Teacher
* [Block.java](Block.java)  - an implementation of a simple Block class.  Students should have more data for their specific implementation.
* [Blockchain.java](Blockchain.java)  - an implementation of a blockchain using a LinkedList.  Any list will work for this project.
* [BlockchainDriver.java](BlockchainDriver.java)  - code that creates a blockchain using Block and Blockchain.  This is the code used in the presentation to model how altering data in 1 block will affect all of the following blocks.
* [BlockchainFileDriver.java](BlockchainFileDriver.java)  - creates the same blockchain as `BlockchainDriver.java' but prints the output to a `.txt` file.  **We recommend using this one for presentation so that you can alter a block and print the new output to a 2nd file for comparison.**

### Secondary (for additional info)
* [How does a blockchain work - Simply Explained](https://www.youtube.com/watch?v=SSo_EIwHSd4)  - The full breath of blockchain just under 6 minutes.

