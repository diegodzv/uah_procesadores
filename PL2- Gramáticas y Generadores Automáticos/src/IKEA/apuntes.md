🔍 En los manuales de IKEA las piezas repetidas no se muestran repetidas en un paso.

El dibujo nunca muestra “3 laterales”, porque NO existen 3 laterales iguales.
Cada paso se hace para un lateral concreto.

Por tanto, introducir cantidades delante de las piezas NO es correcto semánticamente.

Esto generará incoherencias a lo largo de todos los manuales.

================================================================================================

👉 MUCHO mejor usar siempre “TORNILLO”

porque esto:
- mantiene el lenguaje compacto,
- evita ambigüedades,
- simplifica la gramática,
- evita dos tokens casi iguales en el lexer.

================================================================================================

✅ 1. Cada mueble es un contexto independiente

Por tanto:
- Las piezas de BAGGEBO solo existen en BAGGEBO.
- Las piezas de BILLY solo existen en BILLY.
- Los nombres de piezas de un manual no influyen en los demás.

Esto es exactamente igual que:
- Variables en funciones diferentes → no se mezclan.
- Tabla de símbolos por archivo → se reinicia en cada archivo.

================================================================================================

SE ELIMINAN LOS PASOS QUE CONSISTEN EN SUGERENCIAS DE COLOCACIÓN
los herrajes sin id (como los 4 del paso 14 de billy) se han ignorado por no tener identificador
también la 17 de kallax

================================================================================================

🟥 PROBLEMA 1 — En la sección HERRAMIENTAS estás mezclando sintaxis con semántica

Has puesto:

DESTORNILLADOR <ATORNILLAR TORNILLO <id>>
MARTILLO <PONER <ESPIGA <id>> en <PIEZA <tipo>>


Esto no es correcto como gramática del lenguaje:

La sección HERRAMIENTAS debe contener solo herramientas, no instrucciones.

No puede haber <…> dentro porque eso es sintaxis, no vocabulario.

Va a romper la gramática ANTLR.

✔ Lo correcto es que “DESTORNILLADOR” y “MARTILLO” sean simplemente palabras clave:
DESTORNILLADOR
MARTILLO


Y la semántica de quién usa qué la explicas en la memoria, no en el lenguaje.

- DESTORNILLADOR <ATORNILLAR TORNILLO <id>>
- MARTILLO <PONER <ESPIGA <id>> en <PIEZA <tipo>>

decir que he usado chatgpt para buscar errores tipográficos como "poner herrake"

![alt text](image.png) (foto, "🟥 PASO 9 — error tipográfico grave")
❌ PASO 20.2 — Faltó “TORNILLO”