Introduction
Object detection is a computer vision technique that allows us to identify and locate objects in an image or video. With this kind of identification and localization, object detection can be used to count objects in a scene and determine and track their precise locations, all while accurately labeling them.

Imagine, for example, an image that contains two cats and a person. Object detection allows us to at once classify the types of things found while also locating instances of them within the image.

In this guide, you’ll find answers to all of those questions and more. Whether you’re an experienced machine learning engineer considering implementation, a developer wanting to learn more, or a product manager looking to explore what’s possible with computer vision and object detection, this guide is for you.

But how does object detection actually work? What are the different approaches, what are its potential benefits and limitations, and how might you use it in your business?

Here’s a look at what we’ll cover:

Part 1: Object detection – the basics
What is object detection?
Modes and types of object detection
Why is object detection important?
Part 2: How does object detection work?
Inputs and outputs
Basic structure
Model architecture overview
How object detection works on the edge
Part 3: Use cases and applications

Video surveillance
Crowd counting
Anomaly detection
Self-driving cars
Part 4: Resources
Getting started
Tutorials
Literature review
Datasets available

Part 1: Object detection – the basics
What is object detection?
Object detection is a computer vision technique that works to identify and locate objects within an image or video. Specifically, object detection draws bounding boxes around these detected objects, which allow us to locate where said objects are in (or how they move through) a given scene.

Object detection is commonly confused with image recognition, so before we proceed, it’s important that we clarify the distinctions between them.

Image recognition assigns a label to an image. A picture of a dog receives the label “dog”. A picture of two dogs, still receives the label “dog”. Object detection, on the other hand, draws a box around each dog and labels the box “dog”. The model predicts where each object is and what label should be applied. In that way, object detection provides more information about an image than recognition.

Here’s an example of how this distinction looks in practice:

Modes and types of object detection
Broadly speaking, object detection can be broken down into machine learning-based approaches and deep learning-based approaches.

In more traditional ML-based approaches, computer vision techniques are used to look at various features of an image, such as the color histogram or edges, to identify groups of pixels that may belong to an object. These features are then fed into a regression model that predicts the location of the object along with its label.

On the other hand, deep learning-based approaches employ convolutional neural networks (CNNs) to perform end-to-end, unsupervised object detection, in which features don’t need to be defined and extracted separately. For a gentle introduction to CNNs, check out this overview.

Because deep learning methods have become the state-of-the-art approaches to object detection, these are the techniques we’ll be focusing on for the purposes of this guide.

Why is object detection important?

Object detection is inextricably linked to other similar computer vision techniques like image recognition and image segmentation, in that it helps us understand and analyze scenes in images or video.

But there are important differences. Image recognition only outputs a class label for an identified object, and image segmentation creates a pixel-level understanding of a scene’s elements. What separates object detection from these other tasks is its unique ability to locate objects within an image or video. This then allows us to count and then track those objects.

Given these key distinctions and object detection’s unique capabilities, we can see how it can be applied in a number of ways:

Crowd counting
Self-driving cars
Video surveillance
Face detection
Anomaly detection
Of course, this isn’t an exhaustive list, but it includes some of the primary ways in which object detection is shaping our future.