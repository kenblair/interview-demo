interview-demo
==============

Java based coding examples for interviewing purposes.  Each package under `net.kenblair.interview` is a single
self-contained coding demonstration.  Each demonstration is accompanied by one or more unit tests.

## (a) SumIt

Calculate the sum of two integers that are passed as arguments.  Can be completed a number of ways usually involving a
for loop.  Resulting code commonly results in follow up questions:

- What are some cases where this might fail?
  - Start larger than end.
  - Sum is larger than `Integer.MAX_VALUE`.
- What might happen if both numbers are very large?
- What happens if a number is negative?

## (b) Operations

Trivial example of working with Collections.  The interface is only present to see if a candidate has any obvious
difficulty understanding the relationship.  Some common follow up questions:

- What are some cases where this might fail?
  - Null value on a parameter.
  - Using HashSet with objects that do not implement `equals()` and `hashCode()` properly.
- Solution to intersection generally involves `.contains()` therefore:
  - What happens if the implementation passed in has a poor performing `.contains()` implementation?

One of our better candidates pushed the Collection that `.contains()` was being called on into a HashSet specifically to
avoid potential performance issues.

## (c) Spring Example

Interface `Repository` has two implementations and is a dependency of the class `Service`.  First the implementation
`RepositoryOne` must be injected into the service.  Second the implementation `RepositoryTwo` should be injected
instead.  General understanding of DI and qualifiers are expected.  As a follow up questions such as how a prototype
would behave differently from the default singleton are asked.

## (d) Basic Troubleshooting

Inspired by real-life events, seriously.  The expectation is for `FooSubclass` to override `Foo` however the unit test
will fail because it does not.  Troubleshoot the problem.  The simple and obvious answer is to use `@Override` and when
it throws a compile time error observe that the signature is wrong due to a bad import of `java.awt.List`.
