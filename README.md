# Spring Task 1
Both xml-context and java-context have 3 students:
- Jil: avg = 2.0
- Alice: avg = 2.66
- Bob: avg = 5.0

Xml-context has professor Ivan I and java-context has Ivan II.

Added JillBeanPostProcessor to both contexts.

Main.java:
```
Professor from XML context:
Professor{firstName='Ivan', lastName='I', students=[Student{firstName='Jil', lastName='Green', grades={ENGLISH=4, COMPUTER_SCIENCE=4, MATH=4}, enrolled=true}, Student{firstName='Alice', lastName='White', grades={ENGLISH=3, COMPUTER_SCIENCE=3, MATH=2}, enrolled=false}, Student{firstName='Bob', lastName='Builder', grades={ENGLISH=5, COMPUTER_SCIENCE=5, MATH=5}, enrolled=true}]}
Professor from java context:
Professor{firstName='Ivan', lastName='II', students=[Student{firstName='Jil', lastName='Green', grades={COMPUTER_SCIENCE=4, ENGLISH=4, MATH=4}, enrolled=true}, Student{firstName='Alice', lastName='White', grades={COMPUTER_SCIENCE=3, ENGLISH=3, MATH=2}, enrolled=false}, Student{firstName='Bob', lastName='Builder', grades={COMPUTER_SCIENCE=5, ENGLISH=5, MATH=5}, enrolled=true}]}
```
