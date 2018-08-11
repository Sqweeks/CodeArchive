/*
NAME: ADR0001
DATE: 29/07/2018
DESC: Following code allows to read a JSON file from the RAW folder in Android application development.
*/

InputStream dataStream = mContext.getResources().openRawResource(R.raw.data);
Scanner dataScanner = new Scanner(dataStream);

StringBuilder dataBuilder = new StringBuilder();
while (dataScanner.hasNextLine()) {
    dataBuilder.append(dataScanner.nextLine());
}
return new JSONArray(dataBuilder.toString());