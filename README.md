# searchengine

Redovisning av arbete - Sökmotor mot tre tabeller utan fk och varierande kolumnantal.

Efter muntliga redovisningen fortsatte jag att tänka på hur jag kunde göra min sökning. Behöll den, för uppgiften, opraktiska
hållningen att fortsätta med UNION ALL (bara för att jag kunde), vilket satte prov på att få ut datan bra i resultatet.
Fick ordna egen radbrytning, vilket skapade ett problem med att sortera bort dubbletter. 

Hade en viss annan bättre struktur tidigare på fredagen, men efter att felsökt NullException error i timmar, fick jag förändra tills
jag hittade det som genererade ett nullvärde. Vet inte helt än vart det var, men det försvann när jag tog bort .concat() på ett ställe.

Jag har försökt att göra MS1,MS2,MS3 och MS4. Det är upp till dig att avgöra om jag lyckades :)

MS1: 1. Jag har fått in datan i databasen. 
     2. Jag har skapat primär sökning med boolean mode med full text index på hela tabeller.
MS2: 3. Jag har skapat en sekundär sökning med WITH QUERY EXPANSION. Har inte lagt NATURAL LANGUAGE MODE till det, 
        då den antar det automatiskt. QUERY EXPANSION gör en andra sökning på sökordet och hämtar snarlika möjligheter.
MS3  4. Jag har skalat bort (så gott jag känner till) och satt ihop resultatet av primära och sekundära.
     5. Jag sänder mitt resultat till en view.
MS4  6. Jag presenterar resultatet med en ordered list.


Så vitt jag kan se har jag även följt MVC strukturen och har separerat min kod väl.

Ha en trevlig sommar!
Ses till hösten!
