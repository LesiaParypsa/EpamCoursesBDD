Lookup a translation
Narrative:
In order to talk better
As an English student
I want to look up word translations

Scenario: Looking up the translation of 'apple'
Given the user is on the google translate page
And selected languages from 'английский' to 'украинский'
When the user looks up the translation of the word 'apple'
Then they should see the translation 'яблуко'

Scenario: Check the number of characters entered
Given the user is on the google translate page
And selected languages from 'английский' to 'украинский'
When the user looks up the translation of the word 'apple'
Then number of characters must be '5'

Scenario: Looking up the definition of 'apple'
Given the user is on the google translate page
And selected languages from 'английский' to 'украинский'
When the user looks up the translation of the word 'apple'
Then they should see the definition 'the tree which bears apples.'