package com.RPGmaker.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import com.RPGmaker.pojo.event.CommonEvent;
import com.RPGmaker.pojo.event.Event;
import com.RPGmaker.pojo.event.EventList;
import com.RPGmaker.pojo.event.Page;
import com.RPGmaker.pojo.item.Item;
import com.RPGmaker.pojo.map.MapBean;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class IOJsonFile {

	/**
	 * 读取全部的MAP文件
	 * 
	 * @param fileurl
	 * @return List<Object>
	 */
	public List<Object> readerALLMapJsonFile(String fileurl) {
		File files = new File(fileurl);
		List<Object> reList = new LinkedList<Object>();
		for (File file : files.listFiles()) {
			if (file.getName().indexOf("Map") != -1 && file.getName().indexOf("MapInfos.json") == -1) {
				String text = readerFile(file);

				MapBean root = JSON.toJavaObject(JSONObject.parseObject(text), MapBean.class);
				List<Event> l = root.getEvents();
				for (Event event : l) {
					if (event != null) {
						List<Page> lpage = event.getPages();
						for (Page page : lpage) {
							if (page != null) {
								List<EventList> el = page.getList();
								forEachReaderEventList(el, reList);
							}
						}
					}
				}
			}
		}
		return reList;
	}

	/**
	 * 写入读取数据到一个文件中
	 * 
	 * @param filename
	 * @param list
	 * @throws IOException
	 */
	public void writeReaderDateFile(String filename, List<Object> list) throws IOException {
		FileWriter fileWriter = new FileWriter(filename);
		System.out.println("write size:" + list.size());
		for (Object object : list) {
			fileWriter.write(object.toString() + "\n");
		}
		fileWriter.close();
	}

	/**
	 * 将翻译后的文件替换至原来的位置
	 * 
	 * @param originalFileURL
	 * @param translationFileURL
	 * @param outFileURL
	 * @throws IOException
	 */
	public void WriteMapReplacetext(String originalFileURL, String translationFileURL, String outFileURL)
			throws IOException {
		LinkedList<String> writelist = ReaderTranslationFile(translationFileURL);
		System.out.println(writelist.size());
		File files = new File(originalFileURL);
		for (File file : files.listFiles()) {
			if (file.getName().indexOf("Map") != -1 && file.getName().indexOf("MapInfos.json") == -1) {
				String text = readerFile(file);
				MapBean root = JSON.toJavaObject(JSONObject.parseObject(text), MapBean.class);
				List<Event> l = root.getEvents();
				for (Event event : l) {
					if (event != null) {
						List<Page> lpage = event.getPages();
						for (Page page : lpage) {
							if (page != null) {
								List<EventList> eventList = page.getList();
								forEachWriteEventList(eventList, writelist);
							}
						}
					}
				}
				FileWriter writefiles = new FileWriter(outFileURL + file.getName());
				writefiles.write(root.toString().replace("\\\\", "\\"));
				writefiles.close();
			}
		}
	}

	/**
	 * 读取翻译后的文件，逐行添加至List集合
	 */
	private LinkedList<String> ReaderTranslationFile(String translationFileURL) throws IOException {
		LinkedList<String> list = new LinkedList<>();
		File files = new File(translationFileURL);
		for (File file : files.listFiles()) {
			Reader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				list.add(str);
			}
			bufferedReader.close();
			reader.close();
		}
		return list;
	}

	/**
	 * 读取文件成字符串
	 * 
	 * @param file
	 * @return String
	 */
	private String readerFile(File file) {
		Reader reader = null;
		BufferedReader bufferedReader = null;
		StringBuilder text = new StringBuilder();

		try {
			reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				text.append(str);
			}
			bufferedReader.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return text.toString();
	}

	/**
	 * 读取Event类型的JSON文件
	 * 
	 * @param originalFileURL
	 * @return List<Object>
	 */
	public List<Object> readerEventJsonFile(String originalFileURL) {
		File files = new File(originalFileURL);
		List<Object> reList = new LinkedList<Object>();
		for (File file : files.listFiles()) {
			if (file.getName().indexOf("Event") != -1) {
				String text = readerFile(file);
				List<CommonEvent> events = JSONArray.parseArray(text, CommonEvent.class);
				for (CommonEvent commonEvent : events) {
					if (commonEvent != null) {
						List<EventList> eventLists = commonEvent.getList();
						forEachReaderEventList(eventLists, reList);
					}
				}
			}
		}
		return reList;
	}

	/**
	 * 替换公共事件的翻译文件
	 * 
	 * @param originalFileURL
	 * @param translationFileURL
	 * @param outFileURL
	 * @throws IOException
	 */
	public void WriteEventReplacetext(String originalFileURL, String translationFileURL, String outFileURL)
			throws IOException {
		LinkedList<String> writeList = ReaderTranslationFile(translationFileURL);
		File files = new File(originalFileURL);
		for (File file : files.listFiles()) {
			if (file.getName().indexOf("Event") != -1) {
				String text = readerFile(file);
				List<CommonEvent> events = JSONArray.parseArray(text, CommonEvent.class);
				for (CommonEvent commonEvent : events) {
					if (commonEvent != null) {
						List<EventList> eventLists = commonEvent.getList();
						forEachWriteEventList(eventLists, writeList);
					}
				}
				FileWriter writefiles = new FileWriter(outFileURL + file.getName());
				writefiles.write(events.toString().replace("\\\\", "\\"));
				writefiles.close();
			}
		}
	}

	/**
	 * 循环迭代EventList
	 * 
	 * @param eventLists
	 * @param reList
	 */
	private void forEachReaderEventList(List<EventList> eventLists, List<Object> reList) {
		for (EventList eventList : eventLists) {
			if (eventList.getCode() == 401) {
				List<Object> lo = eventList.getParameters();
				for (Object o : lo) {
					reList.add(o);
				}
			} else if (eventList.getCode() == 102) {
				List<Object> lo = eventList.getParameters();
				for (Object o : lo) {
					if (o instanceof List) {
						List<?> ol = (List<?>) o;
						for (Object obj2 : ol) {
							reList.add(obj2);
						}
					}
				}
			}
		}
	}

	/**
	 * 对事件类型中的文本进行替换
	 * 
	 * @param eventLists
	 * @param writeList
	 */
	private void forEachWriteEventList(List<EventList> eventLists, LinkedList<String> writeList) {
		for (EventList eventList : eventLists) {
			if (eventList.getCode() == 401) {
				List<Object> parameters = eventList.getParameters();
				for (int i = 0; i < parameters.size(); i++) {
					parameters.set(i, writeList.getFirst());
					writeList.removeFirst();
				}
			} else if (eventList.getCode() == 102) {
				List<Object> parameters = eventList.getParameters();
				for (Object o : parameters) {
					if (o instanceof List) {
						List<Object> list = (List<Object>) o;
						for (int i = 0; i < list.size(); i++) {
							list.set(i, writeList.getFirst());
							writeList.removeFirst();
						}
					}
				}
			}
		}
	}

	/**
	 * 读取Item类型的文件
	 * 
	 * @param originalFileURL
	 * @return List<Object>
	 */
	public List<Object> readerItemJsonFile(String originalFileURL) {
		File files = new File(originalFileURL);
		List<Object> reList = new LinkedList<Object>();
		for (File file : files.listFiles()) {
			if (file.getName().indexOf("Items") != -1) {
				String text = readerFile(file);
				List<Item> items = JSONArray.parseArray(text, Item.class);
				for (Item item : items) {
					if (item != null) {
						reList.add(item.getName());
						reList.add(item.getDescription());
					}
				}
			}
		}
		return reList;
	}

	/**
	 * 写入Item替换的文件
	 * 
	 * @param originalFileURL
	 * @param translationFileURL
	 * @param outFileURL
	 * @throws IOException
	 */
	public void WriteItemReplacetext(String originalFileURL, String translationFileURL, String outFileURL)
			throws IOException {
		LinkedList<String> writelist = ReaderTranslationFile(translationFileURL);
		File files = new File(originalFileURL);
		for (File file : files.listFiles()) {
			if (file.getName().indexOf("Items") != -1) {
				String text = readerFile(file);
				List<Item> items = JSONArray.parseArray(text, Item.class);
				for (Item item : items) {
					if (item != null) {
						item.setName(writelist.getFirst());
						writelist.removeFirst();
						item.setDescription(writelist.getFirst());
						writelist.removeFirst();
					}
				}
				FileWriter writefiles = new FileWriter(outFileURL + file.getName());
				writefiles.write(items.toString().replace("\\\\", "\\"));
				writefiles.close();
			}
		}
	}
}
